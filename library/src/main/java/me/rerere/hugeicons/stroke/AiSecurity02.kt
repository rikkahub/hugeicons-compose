package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.AiSecurity02: ImageVector
    get() {
        if (_aiSecurity02 != null) {
            return _aiSecurity02!!
        }
        _aiSecurity02 = ImageVector.Builder(
            name = "AiSecurity02",
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
        moveTo(7.5f, 14.5f)
        lineTo(9.34189f, 8.97434f)
        curveTo(9.43631f, 8.69107f, 9.7014f, 8.5f, 10f, 8.5f)
        curveTo(10.2986f, 8.5f, 10.5637f, 8.69107f, 10.6581f, 8.97434f)
        lineTo(12.5f, 14.5f)
        moveTo(15.5f, 8.5f)
        verticalLineTo(14.5f)
        moveTo(8.5f, 12.5f)
        horizontalLineTo(11.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 11.1832f)
        verticalLineTo(8.28017f)
        curveTo(21f, 6.64016f, 21f, 5.82016f, 20.5959f, 5.28517f)
        curveTo(20.1918f, 4.75017f, 19.2781f, 4.49044f, 17.4507f, 3.97098f)
        curveTo(16.2022f, 3.61607f, 15.1016f, 3.18851f, 14.2223f, 2.79817f)
        curveTo(13.0234f, 2.26597f, 12.424f, 1.99988f, 12f, 1.99988f)
        curveTo(11.576f, 1.99988f, 10.9766f, 2.26597f, 9.77771f, 2.79817f)
        curveTo(8.89839f, 3.1885f, 7.79784f, 3.61607f, 6.54933f, 3.97098f)
        curveTo(4.72193f, 4.49044f, 3.80822f, 4.75017f, 3.40411f, 5.28517f)
        curveTo(3f, 5.82016f, 3f, 6.64016f, 3f, 8.28017f)
        verticalLineTo(11.1832f)
        curveTo(3f, 16.8084f, 8.06277f, 20.1834f, 10.594f, 21.5193f)
        curveTo(11.2011f, 21.8397f, 11.5046f, 21.9999f, 12f, 21.9999f)
        curveTo(12.4954f, 21.9999f, 12.7989f, 21.8397f, 13.406f, 21.5193f)
        curveTo(15.9372f, 20.1834f, 21f, 16.8084f, 21f, 11.1832f)
        }
        }.build()

        return _aiSecurity02!!
    }

private var _aiSecurity02: ImageVector? = null
