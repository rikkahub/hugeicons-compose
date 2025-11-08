package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.LegalHammer: ImageVector
    get() {
        if (_legalHammer != null) {
            return _legalHammer!!
        }
        _legalHammer = ImageVector.Builder(
            name = "LegalHammer",
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
        moveTo(11.8333f, 12.1667f)
        curveTo(12.8883f, 13.2216f, 14.2778f, 14.2937f, 14.2778f, 14.2937f)
        lineTo(16.1825f, 12.3889f)
        curveTo(16.1825f, 12.3889f, 15.1105f, 10.9994f, 14.0556f, 9.94444f)
        curveTo(13.0006f, 8.8895f, 11.6111f, 7.81746f, 11.6111f, 7.81746f)
        lineTo(9.70635f, 9.72222f)
        curveTo(9.70635f, 9.72222f, 10.7784f, 11.1117f, 11.8333f, 12.1667f)
        moveTo(11.8333f, 12.1667f)
        lineTo(8.5f, 15.5f)
        moveTo(16.5f, 12.0714f)
        lineTo(13.9603f, 14.6111f)
        moveTo(11.9286f, 7.5f)
        lineTo(9.38889f, 10.0397f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 11.1833f)
        verticalLineTo(8.28029f)
        curveTo(21f, 6.64029f, 21f, 5.82028f, 20.5959f, 5.28529f)
        curveTo(20.1918f, 4.75029f, 19.2781f, 4.49056f, 17.4507f, 3.9711f)
        curveTo(16.2022f, 3.6162f, 15.1016f, 3.18863f, 14.2223f, 2.79829f)
        curveTo(13.0234f, 2.2661f, 12.424f, 2f, 12f, 2f)
        curveTo(11.576f, 2f, 10.9766f, 2.2661f, 9.77771f, 2.79829f)
        curveTo(8.89839f, 3.18863f, 7.79784f, 3.61619f, 6.54933f, 3.9711f)
        curveTo(4.72193f, 4.49056f, 3.80822f, 4.75029f, 3.40411f, 5.28529f)
        curveTo(3f, 5.82028f, 3f, 6.64029f, 3f, 8.28029f)
        verticalLineTo(11.1833f)
        curveTo(3f, 16.8085f, 8.06277f, 20.1835f, 10.594f, 21.5194f)
        curveTo(11.2011f, 21.8398f, 11.5046f, 22f, 12f, 22f)
        curveTo(12.4954f, 22f, 12.7989f, 21.8398f, 13.406f, 21.5194f)
        curveTo(15.9372f, 20.1835f, 21f, 16.8085f, 21f, 11.1833f)
        }
        }.build()

        return _legalHammer!!
    }

private var _legalHammer: ImageVector? = null
