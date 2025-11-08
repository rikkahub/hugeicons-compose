package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Senseless: ImageVector
    get() {
        if (_senseless != null) {
            return _senseless!!
        }
        _senseless = ImageVector.Builder(
            name = "Senseless",
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
        moveTo(8.00265f, 9.01879f)
        curveTo(8.00265f, 9.01879f, 8.25256f, 8.39617f, 7.62377f, 8.09123f)
        curveTo(6.5035f, 7.54795f, 5.03652f, 9.56203f, 6.86627f, 10.6732f)
        curveTo(8.75834f, 11.8222f, 10f, 9.69656f, 10f, 8.09123f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.9974f, 9.98121f)
        curveTo(15.9974f, 9.98121f, 15.7474f, 10.6038f, 16.3762f, 10.9088f)
        curveTo(17.4965f, 11.452f, 18.9635f, 9.43797f, 17.1337f, 8.32683f)
        curveTo(15.2417f, 7.17784f, 14f, 9.30344f, 14f, 10.9088f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 16.6f)
        lineTo(15.7307f, 16.4f)
        curveTo(15.0125f, 15.8667f, 14.1672f, 15.8667f, 13.4491f, 16.4f)
        lineTo(13.1798f, 16.6f)
        curveTo(12.4616f, 17.1333f, 11.6163f, 17.1333f, 10.8982f, 16.6f)
        lineTo(10.6288f, 16.4f)
        curveTo(9.91069f, 15.8667f, 9.06539f, 15.8667f, 8.34723f, 16.4f)
        lineTo(8f, 16.6579f)
        }
        }.build()

        return _senseless!!
    }

private var _senseless: ImageVector? = null
