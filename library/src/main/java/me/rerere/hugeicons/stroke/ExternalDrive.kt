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

val HugeIcons.ExternalDrive: ImageVector
    get() {
        if (_externalDrive != null) {
            return _externalDrive!!
        }
        _externalDrive = ImageVector.Builder(
            name = "ExternalDrive",
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
            moveTo(20f, 18.5f)
            verticalLineTo(10f)
            curveTo(20f, 6.22876f, 20f, 4.34315f, 18.8973f, 3.17157f)
            curveTo(17.7947f, 2f, 16.02f, 2f, 12.4706f, 2f)
            lineTo(11.5294f, 2f)
            curveTo(7.98001f, 2f, 6.20531f, 2f, 5.10266f, 3.17157f)
            curveTo(4f, 4.34315f, 4f, 6.22876f, 4f, 10f)
            lineTo(4f, 18.5f)
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
            moveTo(16.5f, 15f)
            horizontalLineTo(7.5f)
            curveTo(5.567f, 15f, 4f, 16.567f, 4f, 18.5f)
            curveTo(4f, 20.433f, 5.567f, 22f, 7.5f, 22f)
            horizontalLineTo(16.5f)
            curveTo(18.433f, 22f, 20f, 20.433f, 20f, 18.5f)
            curveTo(20f, 16.567f, 18.433f, 15f, 16.5f, 15f)
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
            moveTo(8f, 6f)
            lineTo(10f, 6f)
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
            moveTo(8f, 10f)
            lineTo(10f, 10f)
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
            moveTo(16.125f, 18.5f)
            horizontalLineTo(16f)
            moveTo(16.25f, 18.5f)
            curveTo(16.25f, 18.6381f, 16.1381f, 18.75f, 16f, 18.75f)
            curveTo(15.8619f, 18.75f, 15.75f, 18.6381f, 15.75f, 18.5f)
            curveTo(15.75f, 18.3619f, 15.8619f, 18.25f, 16f, 18.25f)
            curveTo(16.1381f, 18.25f, 16.25f, 18.3619f, 16.25f, 18.5f)
            close()
        }
        }.build()

        return _externalDrive!!
    }

private var _externalDrive: ImageVector? = null
