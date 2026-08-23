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

val HugeIcons.User02: ImageVector
    get() {
        if (_user02 != null) {
            return _user02!!
        }
        _user02 = ImageVector.Builder(
            name = "User02",
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
            strokeLineCap = StrokeCap.Round,
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
        }.build()

        return _user02!!
    }

private var _user02: ImageVector? = null
