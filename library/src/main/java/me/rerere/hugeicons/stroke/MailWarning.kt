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

val HugeIcons.MailWarning: ImageVector
    get() {
        if (_mailWarning != null) {
            return _mailWarning!!
        }
        _mailWarning = ImageVector.Builder(
            name = "MailWarning",
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
            moveTo(2.50049f, 6f)
            lineTo(9.06786f, 9.91697f)
            curveTo(11.489f, 11.361f, 12.512f, 11.361f, 14.9331f, 9.91697f)
            lineTo(21.5005f, 6f)
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
            moveTo(16.0005f, 18.9913f)
            curveTo(15.3997f, 19f, 14.736f, 19f, 14.0005f, 19f)
            horizontalLineTo(10.0005f)
            curveTo(6.22925f, 19f, 4.34363f, 19f, 3.17206f, 17.8284f)
            curveTo(2.00049f, 16.6569f, 2.00049f, 14.7712f, 2.00049f, 11f)
            curveTo(2.00049f, 7.22876f, 2.00049f, 5.34315f, 3.17206f, 4.17157f)
            curveTo(4.34363f, 3f, 6.22925f, 3f, 10.0005f, 3f)
            horizontalLineTo(14.0005f)
            curveTo(17.7717f, 3f, 19.6573f, 3f, 20.8289f, 4.17157f)
            curveTo(21.892f, 5.23467f, 21.9904f, 6.8857f, 21.9996f, 10f)
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
            moveTo(20.0005f, 17f)
            verticalLineTo(13f)
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
            moveTo(20.1255f, 20.75f)
            horizontalLineTo(20.0005f)
            moveTo(20.2505f, 20.75f)
            curveTo(20.2505f, 20.8881f, 20.1386f, 21f, 20.0005f, 21f)
            curveTo(19.8624f, 21f, 19.7505f, 20.8881f, 19.7505f, 20.75f)
            curveTo(19.7505f, 20.6119f, 19.8624f, 20.5f, 20.0005f, 20.5f)
            curveTo(20.1386f, 20.5f, 20.2505f, 20.6119f, 20.2505f, 20.75f)
            close()
        }
        }.build()

        return _mailWarning!!
    }

private var _mailWarning: ImageVector? = null
