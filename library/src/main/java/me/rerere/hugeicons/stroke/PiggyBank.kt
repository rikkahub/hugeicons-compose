package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PiggyBank: ImageVector
    get() {
        if (_piggyBank != null) {
            return _piggyBank!!
        }
        _piggyBank = ImageVector.Builder(
            name = "PiggyBank",
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
        moveTo(13f, 5f)
        curveTo(17.9706f, 5f, 22f, 8.35786f, 22f, 12.5f)
        curveTo(22f, 14.5586f, 21.0047f, 16.4235f, 19.3933f, 17.7787f)
        curveTo(19.1517f, 17.9819f, 19f, 18.2762f, 19f, 18.5919f)
        verticalLineTo(21f)
        horizontalLineTo(17f)
        lineTo(16.2062f, 19.8674f)
        curveTo(16.083f, 19.6916f, 15.8616f, 19.6153f, 15.6537f, 19.6687f)
        curveTo(13.9248f, 20.1132f, 12.0752f, 20.1132f, 10.3463f, 19.6687f)
        curveTo(10.1384f, 19.6153f, 9.91703f, 19.6916f, 9.79384f, 19.8674f)
        lineTo(9f, 21f)
        horizontalLineTo(7f)
        verticalLineTo(18.6154f)
        curveTo(7f, 18.2866f, 6.83835f, 17.9788f, 6.56764f, 17.7922f)
        curveTo(5.49285f, 17.0511f, 2f, 15.6014f, 2f, 14.0582f)
        verticalLineTo(12.5f)
        curveTo(2f, 11.9083f, 2.44771f, 11.4286f, 3f, 11.4286f)
        curveTo(3.60665f, 11.4286f, 4.10188f, 11.1929f, 4.30205f, 10.5661f)
        curveTo(5.32552f, 7.36121f, 8.83187f, 5f, 13f, 5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.5f, 8f)
        curveTo(13.868f, 7.67502f, 13.1963f, 7.5f, 12.5f, 7.5f)
        curveTo(11.8037f, 7.5f, 11.132f, 7.67502f, 10.5f, 8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.49981f, 11f)
        horizontalLineTo(7.50879f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 8.5f)
        curveTo(21.5f, 8f, 22f, 7.06296f, 22f, 5.83053f)
        curveTo(22f, 4.26727f, 20.6569f, 3f, 19f, 3f)
        curveTo(18.6494f, 3f, 18.3128f, 3.05676f, 18f, 3.16106f)
        }
        }.build()

        return _piggyBank!!
    }

private var _piggyBank: ImageVector? = null
