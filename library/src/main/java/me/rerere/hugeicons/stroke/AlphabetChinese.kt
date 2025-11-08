package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.AlphabetChinese: ImageVector
    get() {
        if (_alphabetChinese != null) {
            return _alphabetChinese!!
        }
        _alphabetChinese = ImageVector.Builder(
            name = "AlphabetChinese",
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
        moveTo(7.02344f, 14f)
        horizontalLineTo(18.0234f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.52344f, 9f)
        horizontalLineTo(14.7587f)
        curveTo(15.2218f, 9f, 15.4533f, 9f, 15.5109f, 9.1605f)
        curveTo(15.6967f, 9.67818f, 13.7549f, 11.4137f, 13.4567f, 11.7577f)
        curveTo(12.9682f, 12.3213f, 12.724f, 12.6031f, 12.5954f, 12.9615f)
        curveTo(12.4667f, 13.3198f, 12.4667f, 13.7184f, 12.4667f, 14.5154f)
        verticalLineTo(18.075f)
        curveTo(12.4667f, 19.7377f, 11.5142f, 21f, 9.93177f, 21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5.0157f, 7.99997f)
        curveTo(4.9404f, 7.25983f, 5.06511f, 5.86347f, 7.00907f, 5.99998f)
        horizontalLineTo(17.4743f)
        curveTo(18.1117f, 6.03692f, 19.1963f, 6.46024f, 18.9693f, 7.99997f)
        moveTo(10.9958f, 3f)
        curveTo(11.5968f, 3.31337f, 12.67f, 4.51459f, 12.9892f, 6f)
        }
        }.build()

        return _alphabetChinese!!
    }

private var _alphabetChinese: ImageVector? = null
