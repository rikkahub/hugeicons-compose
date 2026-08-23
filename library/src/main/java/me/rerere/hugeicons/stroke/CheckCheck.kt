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

val HugeIcons.CheckCheck: ImageVector
    get() {
        if (_checkCheck != null) {
            return _checkCheck!!
        }
        _checkCheck = ImageVector.Builder(
            name = "CheckCheck",
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
            moveTo(2f, 13.2593f)
            lineTo(4.58579f, 15.9568f)
            curveTo(5.25245f, 16.6523f, 5.58579f, 17f, 6f, 17f)
            curveTo(6.41421f, 17f, 6.74755f, 16.6523f, 7.41421f, 15.9568f)
            lineTo(16f, 7f)
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
            moveTo(22f, 7f)
            lineTo(13f, 16.3889f)
            curveTo(12.7274f, 16.6733f, 12.5911f, 16.8155f, 12.444f, 16.8915f)
            curveTo(12.1642f, 17.0362f, 11.8358f, 17.0362f, 11.556f, 16.8915f)
            curveTo(11.409f, 16.8155f, 11.2726f, 16.6733f, 11f, 16.3889f)
        }
        }.build()

        return _checkCheck!!
    }

private var _checkCheck: ImageVector? = null
