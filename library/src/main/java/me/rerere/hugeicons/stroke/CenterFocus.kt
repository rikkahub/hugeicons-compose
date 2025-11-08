package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CenterFocus: ImageVector
    get() {
        if (_centerFocus != null) {
            return _centerFocus!!
        }
        _centerFocus = ImageVector.Builder(
            name = "CenterFocus",
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
        moveTo(9.13432f, 2.5f)
        curveTo(6.46805f, 2.56075f, 4.9107f, 2.81456f, 3.84664f, 3.87493f)
        curveTo(2.91537f, 4.80297f, 2.60406f, 6.10756f, 2.5f, 8.2f)
        moveTo(14.8657f, 2.5f)
        curveTo(17.532f, 2.56075f, 19.0893f, 2.81456f, 20.1534f, 3.87493f)
        curveTo(21.0846f, 4.80297f, 21.3959f, 6.10756f, 21.5f, 8.2f)
        moveTo(14.8657f, 21.5f)
        curveTo(17.532f, 21.4392f, 19.0893f, 21.1854f, 20.1534f, 20.1251f)
        curveTo(21.0846f, 19.197f, 21.3959f, 17.8924f, 21.5f, 15.8f)
        moveTo(9.13432f, 21.5f)
        curveTo(6.46805f, 21.4392f, 4.9107f, 21.1854f, 3.84664f, 20.1251f)
        curveTo(2.91537f, 19.197f, 2.60406f, 17.8924f, 2.5f, 15.8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 12f)
        curveTo(16f, 14.2091f, 14.2091f, 16f, 12f, 16f)
        curveTo(9.79086f, 16f, 8f, 14.2091f, 8f, 12f)
        curveTo(8f, 9.79086f, 9.79086f, 8f, 12f, 8f)
        curveTo(14.2091f, 8f, 16f, 9.79086f, 16f, 12f)
        }
        }.build()

        return _centerFocus!!
    }

private var _centerFocus: ImageVector? = null
