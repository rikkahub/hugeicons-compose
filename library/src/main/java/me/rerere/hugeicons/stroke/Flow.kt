package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Flow: ImageVector
    get() {
        if (_flow != null) {
            return _flow!!
        }
        _flow = ImageVector.Builder(
            name = "Flow",
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
        moveTo(21f, 6.5f)
        curveTo(21f, 8.433f, 19.433f, 10f, 17.5f, 10f)
        curveTo(15.567f, 10f, 14f, 8.433f, 14f, 6.5f)
        curveTo(14f, 4.567f, 15.567f, 3f, 17.5f, 3f)
        curveTo(19.433f, 3f, 21f, 4.567f, 21f, 6.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 6.5f)
        curveTo(3f, 4.85008f, 3f, 4.02513f, 3.51256f, 3.51256f)
        curveTo(4.02513f, 3f, 4.85008f, 3f, 6.5f, 3f)
        curveTo(8.14992f, 3f, 8.97487f, 3f, 9.48744f, 3.51256f)
        curveTo(10f, 4.02513f, 10f, 4.85008f, 10f, 6.5f)
        curveTo(10f, 8.14992f, 10f, 8.97487f, 9.48744f, 9.48744f)
        curveTo(8.97487f, 10f, 8.14992f, 10f, 6.5f, 10f)
        curveTo(4.85008f, 10f, 4.02513f, 10f, 3.51256f, 9.48744f)
        curveTo(3f, 8.97487f, 3f, 8.14992f, 3f, 6.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 17.5f)
        curveTo(3f, 15.8501f, 3f, 15.0251f, 3.51256f, 14.5126f)
        curveTo(4.02513f, 14f, 4.85008f, 14f, 6.5f, 14f)
        curveTo(8.14992f, 14f, 8.97487f, 14f, 9.48744f, 14.5126f)
        curveTo(10f, 15.0251f, 10f, 15.8501f, 10f, 17.5f)
        curveTo(10f, 19.1499f, 10f, 19.9749f, 9.48744f, 20.4874f)
        curveTo(8.97487f, 21f, 8.14992f, 21f, 6.5f, 21f)
        curveTo(4.85008f, 21f, 4.02513f, 21f, 3.51256f, 20.4874f)
        curveTo(3f, 19.9749f, 3f, 19.1499f, 3f, 17.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 17.5f)
        curveTo(14f, 15.8501f, 14f, 15.0251f, 14.5126f, 14.5126f)
        curveTo(15.0251f, 14f, 15.8501f, 14f, 17.5f, 14f)
        curveTo(19.1499f, 14f, 19.9749f, 14f, 20.4874f, 14.5126f)
        curveTo(21f, 15.0251f, 21f, 15.8501f, 21f, 17.5f)
        curveTo(21f, 19.1499f, 21f, 19.9749f, 20.4874f, 20.4874f)
        curveTo(19.9749f, 21f, 19.1499f, 21f, 17.5f, 21f)
        curveTo(15.8501f, 21f, 15.0251f, 21f, 14.5126f, 20.4874f)
        curveTo(14f, 19.9749f, 14f, 19.1499f, 14f, 17.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.5f, 10f)
        verticalLineTo(14f)
        moveTo(14f, 17.5f)
        horizontalLineTo(10f)
        moveTo(10f, 6.5f)
        horizontalLineTo(14f)
        }
        }.build()

        return _flow!!
    }

private var _flow: ImageVector? = null
