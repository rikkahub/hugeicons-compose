package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Suit01: ImageVector
    get() {
        if (_suit01 != null) {
            return _suit01!!
        }
        _suit01 = ImageVector.Builder(
            name = "Suit01",
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
        moveTo(8f, 2f)
        curveTo(7f, 2f, 7.18469f, 4.41749f, 5.79936f, 5.4616f)
        curveTo(4.76766f, 6.23919f, 2.89276f, 5.41381f, 2.12762f, 6.72083f)
        curveTo(1.89462f, 7.11885f, 2.00972f, 7.64465f, 2.23991f, 8.69624f)
        lineTo(4.22928f, 17.7845f)
        curveTo(4.61942f, 19.5668f, 4.85901f, 21.7429f, 7f, 22f)
        horizontalLineTo(17f)
        curveTo(19.141f, 21.7429f, 19.3806f, 19.5668f, 19.7707f, 17.7845f)
        lineTo(21.7601f, 8.69624f)
        curveTo(21.9903f, 7.64465f, 22.1054f, 7.11885f, 21.8724f, 6.72083f)
        curveTo(21.1072f, 5.41381f, 19.2323f, 6.23919f, 18.2006f, 5.4616f)
        curveTo(16.8153f, 4.41749f, 17f, 2f, 16f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.009f, 11f)
        lineTo(12f, 11f)
        moveTo(12.009f, 14.5f)
        horizontalLineTo(12f)
        moveTo(12.009f, 18f)
        horizontalLineTo(12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.72422f, 2.11877f)
        curveTo(8.65583f, 1.59549f, 9.94129f, 2.94104f, 10.6046f, 3.4439f)
        curveTo(11.5109f, 4.13102f, 11.9641f, 4.47457f, 11.9974f, 4.92807f)
        curveTo(12.0009f, 4.97597f, 12.0009f, 5.02403f, 11.9974f, 5.07193f)
        curveTo(11.9641f, 5.52543f, 11.5109f, 5.86898f, 10.6046f, 6.5561f)
        curveTo(9.94129f, 7.05896f, 8.65583f, 8.40451f, 7.72422f, 7.88123f)
        curveTo(6.75859f, 7.33885f, 6.75859f, 2.66115f, 7.72422f, 2.11877f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.2758f, 2.11877f)
        curveTo(15.3442f, 1.59549f, 14.0587f, 2.94104f, 13.3954f, 3.4439f)
        curveTo(12.4891f, 4.13102f, 12.0359f, 4.47457f, 12.0026f, 4.92807f)
        curveTo(11.9991f, 4.97597f, 11.9991f, 5.02403f, 12.0026f, 5.07193f)
        curveTo(12.0359f, 5.52543f, 12.4891f, 5.86898f, 13.3954f, 6.5561f)
        curveTo(14.0587f, 7.05896f, 15.3442f, 8.40451f, 16.2758f, 7.88123f)
        curveTo(17.2414f, 7.33885f, 17.2414f, 2.66115f, 16.2758f, 2.11877f)
        }
        }.build()

        return _suit01!!
    }

private var _suit01: ImageVector? = null
