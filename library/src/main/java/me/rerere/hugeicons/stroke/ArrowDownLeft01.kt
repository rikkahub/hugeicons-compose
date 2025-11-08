package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ArrowDownLeft01: ImageVector
    get() {
        if (_arrowDownLeft01 != null) {
            return _arrowDownLeft01!!
        }
        _arrowDownLeft01 = ImageVector.Builder(
            name = "ArrowDownLeft01",
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
        moveTo(15f, 17.3497f)
        curveTo(15f, 17.3497f, 8.06166f, 17.8924f, 7.08461f, 16.9154f)
        curveTo(6.10755f, 15.9383f, 6.65037f, 9f, 6.65037f, 9f)
        moveTo(7.5f, 16.5f)
        lineTo(17.5f, 6.5f)
        }
        }.build()

        return _arrowDownLeft01!!
    }

private var _arrowDownLeft01: ImageVector? = null
