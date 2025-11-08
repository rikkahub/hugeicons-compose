package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.FlowConnection: ImageVector
    get() {
        if (_flowConnection != null) {
            return _flowConnection!!
        }
        _flowConnection = ImageVector.Builder(
            name = "FlowConnection",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2.5f, 5.5f)
        curveTo(2.5f, 3.85008f, 2.5f, 3.02513f, 3.01256f, 2.51256f)
        curveTo(3.52513f, 2f, 4.35008f, 2f, 6f, 2f)
        curveTo(7.64992f, 2f, 8.47487f, 2f, 8.98744f, 2.51256f)
        curveTo(9.5f, 3.02513f, 9.5f, 3.85008f, 9.5f, 5.5f)
        curveTo(9.5f, 7.14992f, 9.5f, 7.97487f, 8.98744f, 8.48744f)
        curveTo(8.47487f, 9f, 7.64992f, 9f, 6f, 9f)
        curveTo(4.35008f, 9f, 3.52513f, 9f, 3.01256f, 8.48744f)
        curveTo(2.5f, 7.97487f, 2.5f, 7.14992f, 2.5f, 5.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3.65685f, 15.6569f)
        curveTo(4.76142f, 14.5523f, 5.31371f, 14f, 6f, 14f)
        curveTo(6.68629f, 14f, 7.23858f, 14.5523f, 8.34315f, 15.6569f)
        curveTo(9.44772f, 16.7614f, 10f, 17.3137f, 10f, 18f)
        curveTo(10f, 18.6863f, 9.44772f, 19.2386f, 8.34315f, 20.3431f)
        curveTo(7.23858f, 21.4477f, 6.68629f, 22f, 6f, 22f)
        curveTo(5.31371f, 22f, 4.76142f, 21.4477f, 3.65685f, 20.3431f)
        curveTo(2.55228f, 19.2386f, 2f, 18.6863f, 2f, 18f)
        curveTo(2f, 17.3137f, 2.55228f, 16.7614f, 3.65685f, 15.6569f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 9f)
        verticalLineTo(14f)
        moveTo(10f, 18f)
        horizontalLineTo(15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 18f)
        curveTo(15f, 16.3501f, 15f, 15.5251f, 15.5126f, 15.0126f)
        curveTo(16.0251f, 14.5f, 16.8501f, 14.5f, 18.5f, 14.5f)
        curveTo(20.1499f, 14.5f, 20.9749f, 14.5f, 21.4874f, 15.0126f)
        curveTo(22f, 15.5251f, 22f, 16.3501f, 22f, 18f)
        curveTo(22f, 19.6499f, 22f, 20.4749f, 21.4874f, 20.9874f)
        curveTo(20.9749f, 21.5f, 20.1499f, 21.5f, 18.5f, 21.5f)
        curveTo(16.8501f, 21.5f, 16.0251f, 21.5f, 15.5126f, 20.9874f)
        curveTo(15f, 20.4749f, 15f, 19.6499f, 15f, 18f)
        }
        }.build()

        return _flowConnection!!
    }

private var _flowConnection: ImageVector? = null
