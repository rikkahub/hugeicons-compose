package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Armchair: ImageVector
    get() {
        if (_armchair != null) {
            return _armchair!!
        }
        _armchair = ImageVector.Builder(
            name = "Armchair",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(4.5f, 19.5f)
            lineTo(4.5f, 21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(19.5f, 19.5f)
            verticalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(2f, 11.5f)
            verticalLineTo(12.8333f)
            curveTo(2f, 15.3256f, 2f, 16.5718f, 2.5359f, 17.5f)
            curveTo(2.88697f, 18.1081f, 3.39192f, 18.613f, 4f, 18.9641f)
            curveTo(4.9282f, 19.5f, 6.17436f, 19.5f, 8.66667f, 19.5f)
            horizontalLineTo(15.3333f)
            curveTo(17.8256f, 19.5f, 19.0718f, 19.5f, 20f, 18.9641f)
            curveTo(20.6081f, 18.613f, 21.113f, 18.1081f, 21.4641f, 17.5f)
            curveTo(22f, 16.5718f, 22f, 15.3256f, 22f, 12.8333f)
            verticalLineTo(11.5f)
            curveTo(22f, 10.3954f, 21.1046f, 9.5f, 20f, 9.5f)
            curveTo(18.8954f, 9.5f, 18f, 10.3954f, 18f, 11.5f)
            verticalLineTo(13.5f)
            curveTo(18f, 14.4428f, 18f, 14.9142f, 17.7071f, 15.2071f)
            curveTo(17.4142f, 15.5f, 16.9428f, 15.5f, 16f, 15.5f)
            horizontalLineTo(8f)
            curveTo(7.05719f, 15.5f, 6.58579f, 15.5f, 6.29289f, 15.2071f)
            curveTo(6f, 14.9142f, 6f, 14.4428f, 6f, 13.5f)
            verticalLineTo(11.5f)
            curveTo(6f, 10.3954f, 5.10457f, 9.5f, 4f, 9.5f)
            curveTo(2.89543f, 9.5f, 2f, 10.3954f, 2f, 11.5f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(6f, 12f)
            verticalLineTo(9f)
            curveTo(6f, 6.17157f, 6f, 4.75736f, 6.87868f, 3.87868f)
            curveTo(7.75736f, 3f, 9.17157f, 3f, 12f, 3f)
            curveTo(14.8284f, 3f, 16.2426f, 3f, 17.1213f, 3.87868f)
            curveTo(18f, 4.75736f, 18f, 6.17157f, 18f, 9f)
            verticalLineTo(12f)
        }
        }.build()

        return _armchair!!
    }

private var _armchair: ImageVector? = null
