package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ArrowUpRight01: ImageVector
    get() {
        if (_arrowUpRight01 != null) {
            return _arrowUpRight01!!
        }
        _arrowUpRight01 = ImageVector.Builder(
            name = "ArrowUpRight01",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 6.65032f)
        curveTo(9f, 6.65032f, 15.9383f, 6.10759f, 16.9154f, 7.08463f)
        curveTo(17.8924f, 8.06167f, 17.3496f, 15f, 17.3496f, 15f)
        moveTo(16.5f, 7.5f)
        lineTo(6.5f, 17.5f)
        }
        }.build()

        return _arrowUpRight01!!
    }

private var _arrowUpRight01: ImageVector? = null
