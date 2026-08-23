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

val HugeIcons.Cog: ImageVector
    get() {
        if (_cog != null) {
            return _cog!!
        }
        _cog = ImageVector.Builder(
            name = "Cog",
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
            moveTo(19.995f, 12f)
            curveTo(19.995f, 7.58172f, 16.4132f, 4f, 11.995f, 4f)
            curveTo(7.5767f, 4f, 3.99498f, 7.58172f, 3.99498f, 12f)
            curveTo(3.99498f, 16.4182f, 7.5767f, 20f, 11.995f, 20f)
            curveTo(16.4132f, 20f, 19.995f, 16.4182f, 19.995f, 12f)
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
            moveTo(13.995f, 12f)
            curveTo(13.995f, 10.8954f, 13.0995f, 10f, 11.995f, 10f)
            curveTo(10.8904f, 10f, 9.99498f, 10.8954f, 9.99498f, 12f)
            curveTo(9.99498f, 13.1046f, 10.8904f, 14f, 11.995f, 14f)
            curveTo(13.0995f, 14f, 13.995f, 13.1046f, 13.995f, 12f)
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
            moveTo(11.995f, 4f)
            verticalLineTo(2f)
            moveTo(11.995f, 20f)
            verticalLineTo(22f)
            moveTo(15.9957f, 5.0693f)
            lineTo(16.9957f, 3.33725f)
            moveTo(6.99566f, 20.6578f)
            lineTo(10.9967f, 13.7248f)
            moveTo(18.9257f, 7.99558f)
            lineTo(20.6577f, 6.99558f)
            moveTo(5.06929f, 15.9956f)
            lineTo(3.33724f, 16.9956f)
            moveTo(22f, 11.9949f)
            lineTo(13.995f, 11.9949f)
            moveTo(4.00003f, 11.9949f)
            horizontalLineTo(2.00003f)
            moveTo(18.9307f, 15.9955f)
            lineTo(20.6628f, 16.9955f)
            moveTo(5.07431f, 7.99554f)
            lineTo(3.34226f, 6.99554f)
            moveTo(16.0044f, 18.9256f)
            lineTo(17.0044f, 20.6577f)
            moveTo(7.00437f, 3.33718f)
            lineTo(10.9278f, 10.1435f)
        }
        }.build()

        return _cog!!
    }

private var _cog: ImageVector? = null
