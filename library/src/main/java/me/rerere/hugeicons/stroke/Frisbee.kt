package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Frisbee: ImageVector
    get() {
        if (_frisbee != null) {
            return _frisbee!!
        }
        _frisbee = ImageVector.Builder(
            name = "Frisbee",
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
        moveTo(4f, 22f)
        lineTo(7f, 19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 20f)
        lineTo(5f, 17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19.7161f, 2.44925f)
        curveTo(21.0334f, 3.76659f, 19.3553f, 7.58059f, 15.9679f, 10.968f)
        curveTo(12.5805f, 14.3555f, 8.76656f, 16.0337f, 7.44924f, 14.7163f)
        moveTo(19.7161f, 2.44925f)
        curveTo(18.3988f, 1.1319f, 14.5848f, 2.81006f, 11.1974f, 6.19752f)
        moveTo(19.7161f, 2.44925f)
        lineTo(21.4198f, 4.15275f)
        curveTo(22.9253f, 5.65829f, 21.3998f, 9.62485f, 18.0124f, 13.0123f)
        curveTo(14.625f, 16.3998f, 10.6585f, 17.9254f, 9.15297f, 16.4198f)
        lineTo(7.44924f, 14.7163f)
        moveTo(7.44924f, 14.7163f)
        curveTo(6.13192f, 13.399f, 7.81005f, 9.58498f, 11.1974f, 6.19752f)
        moveTo(11.1974f, 6.19752f)
        curveTo(8.93918f, 8.45582f, 7.71872f, 10.897f, 8.47148f, 11.6498f)
        curveTo(9.22423f, 12.4025f, 11.6651f, 11.1821f, 13.9234f, 8.92375f)
        curveTo(16.1817f, 6.66545f, 17.4021f, 4.22449f, 16.6494f, 3.47172f)
        curveTo(15.8966f, 2.71895f, 13.4557f, 3.93921f, 11.1974f, 6.19752f)
        }
        }.build()

        return _frisbee!!
    }

private var _frisbee: ImageVector? = null
