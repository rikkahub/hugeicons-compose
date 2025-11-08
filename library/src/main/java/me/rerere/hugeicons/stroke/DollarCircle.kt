package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.DollarCircle: ImageVector
    get() {
        if (_dollarCircle != null) {
            return _dollarCircle!!
        }
        _dollarCircle = ImageVector.Builder(
            name = "DollarCircle",
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
        moveTo(22f, 12f)
        curveTo(22f, 17.5228f, 17.5228f, 22f, 12f, 22f)
        curveTo(6.47715f, 22f, 2f, 17.5228f, 2f, 12f)
        curveTo(2f, 6.47715f, 6.47715f, 2f, 12f, 2f)
        curveTo(17.5228f, 2f, 22f, 6.47715f, 22f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.7102f, 10.0611f)
        curveTo(14.6111f, 9.29844f, 13.7354f, 8.06622f, 12.1608f, 8.06619f)
        curveTo(10.3312f, 8.06616f, 9.56136f, 9.07946f, 9.40515f, 9.58611f)
        curveTo(9.16145f, 10.2638f, 9.21019f, 11.6571f, 11.3547f, 11.809f)
        curveTo(14.0354f, 11.999f, 15.1093f, 12.3154f, 14.9727f, 13.956f)
        curveTo(14.836f, 15.5965f, 13.3417f, 15.951f, 12.1608f, 15.9129f)
        curveTo(10.9798f, 15.875f, 9.04764f, 15.3325f, 8.97266f, 13.8733f)
        moveTo(11.9734f, 6.99805f)
        verticalLineTo(8.06982f)
        moveTo(11.9734f, 15.9031f)
        verticalLineTo(16.998f)
        }
        }.build()

        return _dollarCircle!!
    }

private var _dollarCircle: ImageVector? = null
