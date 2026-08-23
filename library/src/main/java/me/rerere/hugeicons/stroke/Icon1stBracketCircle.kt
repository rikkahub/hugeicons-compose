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

val HugeIcons.Icon1stBracketCircle: ImageVector
    get() {
        if (_icon1stBracketCircle != null) {
            return _icon1stBracketCircle!!
        }
        _icon1stBracketCircle = ImageVector.Builder(
            name = "Icon1stBracketCircle",
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
            moveTo(9f, 8f)
            curveTo(7.7945f, 8.85994f, 7f, 10.3304f, 7f, 12f)
            curveTo(7f, 13.6696f, 7.7945f, 15.1401f, 9f, 16f)
            moveTo(15f, 8f)
            curveTo(16.2055f, 8.85994f, 17f, 10.3304f, 17f, 12f)
            curveTo(17f, 13.6696f, 16.2055f, 15.1401f, 15f, 16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(22f, 12f)
            arcTo(10f, 10f, 0f, true, false, 2f, 12f)
            arcTo(10f, 10f, 0f, true, false, 22f, 12f)
            close()
        }
        }.build()

        return _icon1stBracketCircle!!
    }

private var _icon1stBracketCircle: ImageVector? = null
