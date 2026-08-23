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

val HugeIcons.UserAdd01: ImageVector
    get() {
        if (_userAdd01 != null) {
            return _userAdd01!!
        }
        _userAdd01 = ImageVector.Builder(
            name = "UserAdd01",
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
            moveTo(3f, 20.5002f)
            curveTo(3.28417f, 16.8058f, 6.3f, 13.7193f, 10.0008f, 13.5379f)
            curveTo(10.3134f, 13.5226f, 10.6446f, 13.5097f, 11f, 13.5f)
            lineTo(11.995f, 13.5663f)
            curveTo(12.6939f, 13.6129f, 13.3665f, 13.7543f, 14f, 13.9777f)
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
            moveTo(18f, 15.5f)
            verticalLineTo(21.5f)
            moveTo(21f, 18.5f)
            lineTo(15f, 18.5f)
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
        }.build()

        return _userAdd01!!
    }

private var _userAdd01: ImageVector? = null
