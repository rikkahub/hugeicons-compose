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

val HugeIcons.UserWarning02: ImageVector
    get() {
        if (_userWarning02 != null) {
            return _userWarning02!!
        }
        _userWarning02 = ImageVector.Builder(
            name = "UserWarning02",
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
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(16f, 7f)
            arcTo(4f, 4f, 0f, true, false, 8f, 7f)
            arcTo(4f, 4f, 0f, true, false, 16f, 7f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(12f, 14f)
            curveTo(7f, 14f, 4f, 16.5f, 4f, 19f)
            curveTo(4f, 20.1046f, 4.89543f, 21f, 6f, 21f)
            horizontalLineTo(18f)
            curveTo(19.1046f, 21f, 20f, 20.1046f, 20f, 19f)
            curveTo(20f, 16.5f, 17f, 14f, 12f, 14f)
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
            moveTo(20f, 6f)
            verticalLineTo(10f)
            moveTo(20f, 13f)
            verticalLineTo(13.01f)
        }
        }.build()

        return _userWarning02!!
    }

private var _userWarning02: ImageVector? = null
