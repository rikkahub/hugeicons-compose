package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Summation01: ImageVector
    get() {
        if (_summation01 != null) {
            return _summation01!!
        }
        _summation01 = ImageVector.Builder(
            name = "Summation01",
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
        moveTo(19f, 17.1429f)
        curveTo(19f, 18.6464f, 19f, 19.3982f, 18.6504f, 19.9471f)
        curveTo(18.468f, 20.2333f, 18.2227f, 20.4753f, 17.9325f, 20.6551f)
        curveTo(17.3761f, 21f, 16.6139f, 21f, 15.0895f, 21f)
        horizontalLineTo(9.19861f)
        curveTo(6.61368f, 21f, 5.32121f, 21f, 5.04567f, 20.2653f)
        curveTo(4.77014f, 19.5306f, 5.75145f, 18.701f, 7.71408f, 17.0417f)
        lineTo(11.6568f, 13.7083f)
        curveTo(12.5958f, 12.9144f, 13.0654f, 12.5174f, 13.0654f, 12f)
        curveTo(13.0654f, 11.4826f, 12.5958f, 11.0856f, 11.6568f, 10.2917f)
        lineTo(7.71408f, 6.95833f)
        curveTo(5.75145f, 5.29902f, 4.77014f, 4.46937f, 5.04567f, 3.73469f)
        curveTo(5.32121f, 3f, 6.61368f, 3f, 9.19861f, 3f)
        horizontalLineTo(15.0895f)
        curveTo(16.6139f, 3f, 17.3761f, 3f, 17.9325f, 3.34487f)
        curveTo(18.2227f, 3.52471f, 18.468f, 3.76672f, 18.6504f, 4.05293f)
        curveTo(19f, 4.60179f, 19f, 5.35357f, 19f, 6.85714f)
        }
        }.build()

        return _summation01!!
    }

private var _summation01: ImageVector? = null
