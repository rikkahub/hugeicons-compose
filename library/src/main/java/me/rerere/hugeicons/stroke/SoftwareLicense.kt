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

val HugeIcons.SoftwareLicense: ImageVector
    get() {
        if (_softwareLicense != null) {
            return _softwareLicense!!
        }
        _softwareLicense = ImageVector.Builder(
            name = "SoftwareLicense",
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
            moveTo(18f, 19.6231f)
            curveTo(18.6891f, 19.4279f, 19.2323f, 19.1317f, 19.682f, 18.682f)
            curveTo(21f, 17.364f, 21f, 15.2426f, 21f, 11f)
            curveTo(21f, 6.75736f, 21f, 4.63604f, 19.682f, 3.31802f)
            curveTo(18.364f, 2f, 16.2426f, 2f, 12f, 2f)
            curveTo(7.75736f, 2f, 5.63604f, 2f, 4.31802f, 3.31802f)
            curveTo(3f, 4.63604f, 3f, 6.75736f, 3f, 11f)
            curveTo(3f, 15.2426f, 3f, 17.364f, 4.31802f, 18.682f)
            curveTo(4.76772f, 19.1317f, 5.31093f, 19.4279f, 6f, 19.6231f)
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
            moveTo(3.5f, 7f)
            horizontalLineTo(20.5f)
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
            moveTo(12f, 11f)
            curveTo(13.6569f, 11f, 15f, 12.3431f, 15f, 14f)
            curveTo(15f, 15.6569f, 13.6569f, 17f, 12f, 17f)
            curveTo(10.3431f, 17f, 9f, 15.6569f, 9f, 14f)
            curveTo(9f, 12.3431f, 10.3431f, 11f, 12f, 11f)
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
            moveTo(14f, 16.5f)
            verticalLineTo(22f)
            lineTo(12f, 20.5f)
            lineTo(10f, 22f)
            verticalLineTo(16.5f)
        }
        }.build()

        return _softwareLicense!!
    }

private var _softwareLicense: ImageVector? = null
