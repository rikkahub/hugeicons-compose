package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ArrowDown01: ImageVector
    get() {
        if (_arrowDown01 != null) {
            return _arrowDown01!!
        }
        _arrowDown01 = ImageVector.Builder(
            name = "ArrowDown01",
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
        moveTo(18f, 9.00005f)
        curveTo(18f, 9.00005f, 13.5811f, 15f, 12f, 15f)
        curveTo(10.4188f, 15f, 6f, 9f, 6f, 9f)
        }
        }.build()

        return _arrowDown01!!
    }

private var _arrowDown01: ImageVector? = null
