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

val HugeIcons.Drive: ImageVector
    get() {
        if (_drive != null) {
            return _drive!!
        }
        _drive = ImageVector.Builder(
            name = "Drive",
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
            moveTo(20f, 19f)
            verticalLineTo(10f)
            curveTo(20f, 6.22876f, 20f, 4.34315f, 18.8973f, 3.17157f)
            curveTo(17.7947f, 2f, 16.02f, 2f, 12.4706f, 2f)
            lineTo(11.5294f, 2f)
            curveTo(7.98001f, 2f, 6.20531f, 2f, 5.10266f, 3.17157f)
            curveTo(4f, 4.34315f, 4f, 6.22876f, 4f, 10f)
            lineTo(4f, 19f)
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
            moveTo(17f, 16f)
            horizontalLineTo(7f)
            curveTo(5.34315f, 16f, 4f, 17.3431f, 4f, 19f)
            curveTo(4f, 20.6569f, 5.34315f, 22f, 7f, 22f)
            horizontalLineTo(17f)
            curveTo(18.6569f, 22f, 20f, 20.6569f, 20f, 19f)
            curveTo(20f, 17.3431f, 18.6569f, 16f, 17f, 16f)
            close()
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
            moveTo(10.5f, 11f)
            horizontalLineTo(13.5f)
            moveTo(12f, 6.75f)
            verticalLineTo(7f)
            moveTo(11.5f, 10f)
            horizontalLineTo(12.5f)
            curveTo(13.6046f, 10f, 14.5f, 10.8954f, 14.5f, 12f)
            horizontalLineTo(9.5f)
            curveTo(9.5f, 10.8954f, 10.3954f, 10f, 11.5f, 10f)
            close()
            moveTo(12.75f, 6.75f)
            curveTo(12.75f, 7.16421f, 12.4142f, 7.5f, 12f, 7.5f)
            curveTo(11.5858f, 7.5f, 11.25f, 7.16421f, 11.25f, 6.75f)
            curveTo(11.25f, 6.33579f, 11.5858f, 6f, 12f, 6f)
            curveTo(12.4142f, 6f, 12.75f, 6.33579f, 12.75f, 6.75f)
            close()
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
            moveTo(7.375f, 19f)
            horizontalLineTo(7.25f)
            moveTo(7.5f, 19f)
            curveTo(7.5f, 19.1381f, 7.38807f, 19.25f, 7.25f, 19.25f)
            curveTo(7.11193f, 19.25f, 7f, 19.1381f, 7f, 19f)
            curveTo(7f, 18.8619f, 7.11193f, 18.75f, 7.25f, 18.75f)
            curveTo(7.38807f, 18.75f, 7.5f, 18.8619f, 7.5f, 19f)
            close()
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
            moveTo(10.875f, 19f)
            horizontalLineTo(10.75f)
            moveTo(11f, 19f)
            curveTo(11f, 19.1381f, 10.8881f, 19.25f, 10.75f, 19.25f)
            curveTo(10.6119f, 19.25f, 10.5f, 19.1381f, 10.5f, 19f)
            curveTo(10.5f, 18.8619f, 10.6119f, 18.75f, 10.75f, 18.75f)
            curveTo(10.8881f, 18.75f, 11f, 18.8619f, 11f, 19f)
            close()
        }
        }.build()

        return _drive!!
    }

private var _drive: ImageVector? = null
