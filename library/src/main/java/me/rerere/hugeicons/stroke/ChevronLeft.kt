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

val HugeIcons.ChevronLeft: ImageVector
    get() {
        if (_chevronLeft != null) {
            return _chevronLeft!!
        }
        _chevronLeft = ImageVector.Builder(
            name = "ChevronLeft",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
            autoMirror = true
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
            moveTo(15f, 18f)
            curveTo(15f, 18f, 9.00001f, 13.5811f, 9f, 12f)
            curveTo(8.99999f, 10.4188f, 15f, 6f, 15f, 6f)
        }
        }.build()

        return _chevronLeft!!
    }

private var _chevronLeft: ImageVector? = null
