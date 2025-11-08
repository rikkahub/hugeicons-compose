package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Dna01: ImageVector
    get() {
        if (_dna01 != null) {
            return _dna01!!
        }
        _dna01 = ImageVector.Builder(
            name = "Dna01",
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
        moveTo(8.6671f, 22f)
        curveTo(9.20107f, 21.466f, 9.73505f, 20.9321f, 9.24127f, 18f)
        moveTo(8.6671f, 15.3336f)
        curveTo(7.33381f, 10.0004f, 8.33378f, 9.00042f, 8.6671f, 8.6671f)
        curveTo(9.00042f, 8.33378f, 10.0004f, 7.33381f, 15.3336f, 8.6671f)
        moveTo(8.6671f, 15.3336f)
        curveTo(3.33394f, 14.0003f, 2.66664f, 14.6663f, 2f, 15.3329f)
        moveTo(8.6671f, 15.3336f)
        curveTo(14.0003f, 16.6668f, 14.9996f, 15.6662f, 15.3329f, 15.3329f)
        curveTo(15.6662f, 14.9996f, 16.6668f, 14.0003f, 15.3336f, 8.6671f)
        moveTo(22f, 8.6671f)
        curveTo(21.3334f, 9.33375f, 20.6667f, 10.0004f, 15.3336f, 8.6671f)
        moveTo(15.3329f, 2f)
        curveTo(14.799f, 2.53394f, 14.2654f, 3.06829f, 14.7592f, 6f)
        }
        }.build()

        return _dna01!!
    }

private var _dna01: ImageVector? = null
