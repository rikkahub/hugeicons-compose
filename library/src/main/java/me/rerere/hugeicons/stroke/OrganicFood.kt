package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.OrganicFood: ImageVector
    get() {
        if (_organicFood != null) {
            return _organicFood!!
        }
        _organicFood = ImageVector.Builder(
            name = "OrganicFood",
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
        moveTo(10f, 9.25524f)
        curveTo(7.60631f, 7.95835f, 5.08056f, 5.71428f, 3f, 2f)
        moveTo(11.6155f, 4.41901f)
        curveTo(9.5805f, 3.0835f, 7.09742f, 3.64165f, 6.06938f, 5.66567f)
        curveTo(5.04134f, 7.68969f, 5.85764f, 10.4131f, 7.89263f, 11.7486f)
        curveTo(9.73497f, 12.9577f, 13.7672f, 14.2079f, 17f, 10.745f)
        curveTo(13.9706f, 9.45488f, 13.6505f, 5.75451f, 11.6155f, 4.41901f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 11f)
        curveTo(3.36093f, 11.4709f, 3f, 12.0054f, 3f, 12.572f)
        curveTo(3f, 14.4652f, 7.02944f, 16f, 12f, 16f)
        curveTo(16.9706f, 16f, 21f, 14.4652f, 21f, 12.572f)
        curveTo(21f, 12.0054f, 20.6391f, 11.4709f, 20f, 11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 13f)
        curveTo(21f, 16.5766f, 18.4936f, 19.7147f, 15.7951f, 21.4822f)
        curveTo(15.2402f, 21.8457f, 14.5804f, 22f, 13.9171f, 22f)
        horizontalLineTo(10.0829f)
        curveTo(9.41959f, 22f, 8.75976f, 21.8457f, 8.20486f, 21.4822f)
        curveTo(5.5064f, 19.7147f, 3f, 16.5766f, 3f, 13f)
        }
        }.build()

        return _organicFood!!
    }

private var _organicFood: ImageVector? = null
