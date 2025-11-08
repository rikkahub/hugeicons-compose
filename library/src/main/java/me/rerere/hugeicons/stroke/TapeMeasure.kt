package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.TapeMeasure: ImageVector
    get() {
        if (_tapeMeasure != null) {
            return _tapeMeasure!!
        }
        _tapeMeasure = ImageVector.Builder(
            name = "TapeMeasure",
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
        moveTo(5f, 9.97873f)
        curveTo(5f, 11.095f, 6.79086f, 12f, 9f, 12f)
        verticalLineTo(9.97873f)
        curveTo(9f, 8.98454f, 9f, 8.48745f, 8.60252f, 8.18419f)
        curveTo(8.20504f, 7.88092f, 7.811f, 7.99435f, 7.02292f, 8.22121f)
        curveTo(5.81469f, 8.56902f, 5f, 9.2258f, 5f, 9.97873f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 8.5f)
        curveTo(16f, 10.433f, 12.866f, 12f, 9f, 12f)
        curveTo(5.13401f, 12f, 2f, 10.433f, 2f, 8.5f)
        curveTo(2f, 6.567f, 5.13401f, 5f, 9f, 5f)
        curveTo(12.866f, 5f, 16f, 6.567f, 16f, 8.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 9f)
        verticalLineTo(15.6667f)
        curveTo(2f, 17.5076f, 5.13401f, 19f, 9f, 19f)
        horizontalLineTo(20f)
        curveTo(20.9428f, 19f, 21.4142f, 19f, 21.7071f, 18.7071f)
        curveTo(22f, 18.4142f, 22f, 17.9428f, 22f, 17f)
        verticalLineTo(14f)
        curveTo(22f, 13.0572f, 22f, 12.5858f, 21.7071f, 12.2929f)
        curveTo(21.4142f, 12f, 20.9428f, 12f, 20f, 12f)
        horizontalLineTo(9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 19f)
        verticalLineTo(17f)
        moveTo(14f, 19f)
        verticalLineTo(17f)
        moveTo(10f, 19f)
        verticalLineTo(17f)
        moveTo(6f, 18.5f)
        verticalLineTo(16.5f)
        }
        }.build()

        return _tapeMeasure!!
    }

private var _tapeMeasure: ImageVector? = null
