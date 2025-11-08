package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CloudHailstone: ImageVector
    get() {
        if (_cloudHailstone != null) {
            return _cloudHailstone!!
        }
        _cloudHailstone = ImageVector.Builder(
            name = "CloudHailstone",
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
        moveTo(17.4776f, 8.7803f)
        lineTo(17.5f, 8.78025f)
        curveTo(19.9853f, 8.78025f, 22f, 10.7212f, 22f, 13.1154f)
        curveTo(22f, 14.8176f, 20.9817f, 16.2906f, 19.5f, 17f)
        moveTo(17.4776f, 8.7803f)
        curveTo(17.4924f, 8.62164f, 17.5f, 8.46095f, 17.5f, 8.29856f)
        curveTo(17.5f, 5.37225f, 15.0376f, 3f, 12f, 3f)
        curveTo(9.12324f, 3f, 6.76233f, 5.12773f, 6.52042f, 7.83875f)
        moveTo(17.4776f, 8.7803f)
        curveTo(17.3753f, 9.8732f, 16.9286f, 10.8704f, 16.2428f, 11.6704f)
        moveTo(6.52042f, 7.83875f)
        curveTo(3.98398f, 8.07128f, 2f, 10.1293f, 2f, 12.6338f)
        curveTo(2f, 14.566f, 3.18102f, 16.2326f, 4.88559f, 17f)
        moveTo(6.52042f, 7.83875f)
        curveTo(6.67826f, 7.82428f, 6.83823f, 7.81688f, 7f, 7.81688f)
        curveTo(8.12582f, 7.81688f, 9.16474f, 8.17534f, 10.0005f, 8.78025f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.9978f, 14f)
        lineTo(12.0022f, 14.0078f)
        moveTo(14.9966f, 16.9967f)
        lineTo(15.0011f, 17.0044f)
        moveTo(8.99888f, 16.9967f)
        lineTo(9.00337f, 17.0044f)
        moveTo(17.9955f, 19.9933f)
        lineTo(18f, 20.0011f)
        moveTo(6f, 19.9933f)
        lineTo(6.00449f, 20.0011f)
        moveTo(11.9978f, 20.9922f)
        lineTo(12.0022f, 21f)
        }
        }.build()

        return _cloudHailstone!!
    }

private var _cloudHailstone: ImageVector? = null
