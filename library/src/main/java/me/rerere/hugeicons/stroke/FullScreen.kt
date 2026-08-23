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

val HugeIcons.Fullscreen: ImageVector
    get() {
        if (_fullscreen != null) {
            return _fullscreen!!
        }
        _fullscreen = ImageVector.Builder(
            name = "Fullscreen",
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
            moveTo(17f, 3f)
            curveTo(17.4644f, 3f, 17.6966f, 3f, 17.8919f, 3.02201f)
            curveTo(19.5145f, 3.20484f, 20.7952f, 4.48545f, 20.978f, 6.10812f)
            curveTo(21f, 6.30344f, 21f, 6.53563f, 21f, 7f)
            moveTo(17f, 21f)
            curveTo(17.4644f, 21f, 17.6966f, 21f, 17.8919f, 20.978f)
            curveTo(19.5145f, 20.7952f, 20.7952f, 19.5145f, 20.978f, 17.8919f)
            curveTo(21f, 17.6966f, 21f, 17.4644f, 21f, 17f)
            moveTo(7f, 3f)
            curveTo(6.53563f, 3f, 6.30344f, 3f, 6.10812f, 3.02201f)
            curveTo(4.48545f, 3.20484f, 3.20484f, 4.48545f, 3.02201f, 6.10812f)
            curveTo(3f, 6.30344f, 3f, 6.53563f, 3f, 7f)
            moveTo(7f, 21f)
            curveTo(6.53563f, 21f, 6.30344f, 21f, 6.10812f, 20.978f)
            curveTo(4.48545f, 20.7952f, 3.20484f, 19.5145f, 3.02201f, 17.8919f)
            curveTo(3f, 17.6966f, 3f, 17.4644f, 3f, 17f)
        }
        }.build()

        return _fullscreen!!
    }

private var _fullscreen: ImageVector? = null
