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

val HugeIcons.UserLock02: ImageVector
    get() {
        if (_userLock02 != null) {
            return _userLock02!!
        }
        _userLock02 = ImageVector.Builder(
            name = "UserLock02",
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
            moveTo(13.75f, 6f)
            arcTo(4f, 4f, 0f, true, false, 5.75f, 6f)
            arcTo(4f, 4f, 0f, true, false, 13.75f, 6f)
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
            moveTo(9.75f, 13f)
            curveTo(4.75f, 13f, 1.75f, 15.5f, 1.75f, 18f)
            curveTo(1.75f, 19.1046f, 2.64543f, 20f, 3.75f, 20f)
            horizontalLineTo(15.75f)
            curveTo(16.8546f, 20f, 17.75f, 19.1046f, 17.75f, 18f)
            curveTo(17.75f, 15.5f, 14.75f, 13f, 9.75f, 13f)
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
            moveTo(20.75f, 8f)
            verticalLineTo(6.5f)
            curveTo(20.75f, 5.67157f, 20.0784f, 5f, 19.25f, 5f)
            curveTo(18.4216f, 5f, 17.75f, 5.67157f, 17.75f, 6.5f)
            verticalLineTo(8f)
            moveTo(20.75f, 8f)
            horizontalLineTo(17.75f)
            moveTo(20.75f, 8f)
            curveTo(21.5784f, 8f, 22.25f, 8.67157f, 22.25f, 9.5f)
            verticalLineTo(10.5f)
            curveTo(22.25f, 11.3284f, 21.5784f, 12f, 20.75f, 12f)
            horizontalLineTo(17.75f)
            curveTo(16.9216f, 12f, 16.25f, 11.3284f, 16.25f, 10.5f)
            verticalLineTo(9.5f)
            curveTo(16.25f, 8.67157f, 16.9216f, 8f, 17.75f, 8f)
        }
        }.build()

        return _userLock02!!
    }

private var _userLock02: ImageVector? = null
