package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ArrowUp01: ImageVector
    get() {
        if (_arrowUp01 != null) {
            return _arrowUp01!!
        }
        _arrowUp01 = ImageVector.Builder(
            name = "ArrowUp01",
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
        moveTo(17.9998f, 15f)
        curveTo(17.9998f, 15f, 13.5809f, 9.00001f, 11.9998f, 9f)
        curveTo(10.4187f, 8.99999f, 5.99985f, 15f, 5.99985f, 15f)
        }
        }.build()

        return _arrowUp01!!
    }

private var _arrowUp01: ImageVector? = null
