package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ArrowLeft01: ImageVector
    get() {
        if (_arrowLeft01 != null) {
            return _arrowLeft01!!
        }
        _arrowLeft01 = ImageVector.Builder(
            name = "ArrowLeft01",
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
        moveTo(15f, 6f)
        curveTo(15f, 6f, 9.00001f, 10.4189f, 9f, 12f)
        curveTo(8.99999f, 13.5812f, 15f, 18f, 15f, 18f)
        }
        }.build()

        return _arrowLeft01!!
    }

private var _arrowLeft01: ImageVector? = null
