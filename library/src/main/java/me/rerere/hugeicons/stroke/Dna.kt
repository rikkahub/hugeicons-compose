package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Dna: ImageVector
    get() {
        if (_dna != null) {
            return _dna!!
        }
        _dna = ImageVector.Builder(
            name = "Dna",
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
        moveTo(22.0004f, 8.44332f)
        curveTo(20.2212f, 10.2226f, 17.3364f, 10.2226f, 15.5571f, 8.44332f)
        curveTo(13.7778f, 6.66405f, 13.7778f, 3.77927f, 15.5571f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 15.5567f)
        curveTo(3.77927f, 13.7774f, 6.66405f, 13.7774f, 8.44332f, 15.5567f)
        curveTo(10.2226f, 17.336f, 10.2226f, 20.2207f, 8.44332f, 22f)
        }
        }.build()

        return _dna!!
    }

private var _dna: ImageVector? = null
