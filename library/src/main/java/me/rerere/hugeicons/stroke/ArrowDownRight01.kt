package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ArrowDownRight01: ImageVector
    get() {
        if (_arrowDownRight01 != null) {
            return _arrowDownRight01!!
        }
        _arrowDownRight01 = ImageVector.Builder(
            name = "ArrowDownRight01",
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
        moveTo(9f, 17.3497f)
        curveTo(9f, 17.3497f, 15.9383f, 17.8924f, 16.9154f, 16.9154f)
        curveTo(17.8924f, 15.9383f, 17.3496f, 9f, 17.3496f, 9f)
        moveTo(16.5f, 16.5f)
        lineTo(6.5f, 6.5f)
        }
        }.build()

        return _arrowDownRight01!!
    }

private var _arrowDownRight01: ImageVector? = null
