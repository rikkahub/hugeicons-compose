package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.GreaterThanCircle: ImageVector
    get() {
        if (_greaterThanCircle != null) {
            return _greaterThanCircle!!
        }
        _greaterThanCircle = ImageVector.Builder(
            name = "GreaterThanCircle",
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
        moveTo(10f, 8f)
        lineTo(13.3322f, 11.0203f)
        curveTo(14.2226f, 11.8273f, 14.2226f, 12.1727f, 13.3322f, 12.9797f)
        lineTo(10f, 16f)
        }
        }.build()

        return _greaterThanCircle!!
    }

private var _greaterThanCircle: ImageVector? = null
