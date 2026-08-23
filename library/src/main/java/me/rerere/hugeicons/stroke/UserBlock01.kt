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

val HugeIcons.UserBlock01: ImageVector
    get() {
        if (_userBlock01 != null) {
            return _userBlock01!!
        }
        _userBlock01 = ImageVector.Builder(
            name = "UserBlock01",
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
            moveTo(11.995f, 13.5663f)
            lineTo(11f, 13.5f)
            curveTo(10.6446f, 13.5097f, 10.3134f, 13.5226f, 10.0008f, 13.5379f)
            curveTo(6.3f, 13.7193f, 3.28417f, 16.8058f, 3f, 20.5002f)
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
            moveTo(15f, 6.5f)
            arcTo(4f, 4f, 0f, true, false, 7f, 6.5f)
            arcTo(4f, 4f, 0f, true, false, 15f, 6.5f)
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
            moveTo(15.5f, 16f)
            lineTo(19.5f, 20f)
            moveTo(21f, 18f)
            curveTo(21f, 16.067f, 19.433f, 14.5f, 17.5f, 14.5f)
            curveTo(15.567f, 14.5f, 14f, 16.067f, 14f, 18f)
            curveTo(14f, 19.933f, 15.567f, 21.5f, 17.5f, 21.5f)
            curveTo(19.433f, 21.5f, 21f, 19.933f, 21f, 18f)
            close()
        }
        }.build()

        return _userBlock01!!
    }

private var _userBlock01: ImageVector? = null
