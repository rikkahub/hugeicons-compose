package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ArrowRight01: ImageVector
    get() {
        if (_arrowRight01 != null) {
            return _arrowRight01!!
        }
        _arrowRight01 = ImageVector.Builder(
            name = "ArrowRight01",
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
        moveTo(9.00005f, 6f)
        curveTo(9.00005f, 6f, 15f, 10.4189f, 15f, 12f)
        curveTo(15f, 13.5812f, 9f, 18f, 9f, 18f)
        }
        }.build()

        return _arrowRight01!!
    }

private var _arrowRight01: ImageVector? = null
