package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Saturn01: ImageVector
    get() {
        if (_saturn01 != null) {
            return _saturn01!!
        }
        _saturn01 = ImageVector.Builder(
            name = "Saturn01",
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
        moveTo(5.63604f, 18.3638f)
        curveTo(4.00736f, 16.7351f, 3f, 14.4851f, 3f, 11.9999f)
        curveTo(3f, 7.02929f, 7.02944f, 2.99986f, 12f, 2.99986f)
        curveTo(14.4853f, 2.99986f, 16.7353f, 4.00721f, 18.364f, 5.63589f)
        moveTo(20.2941f, 8.49986f)
        curveTo(20.7487f, 9.57574f, 21f, 10.7584f, 21f, 11.9999f)
        curveTo(21f, 16.9704f, 16.9706f, 20.9999f, 12f, 20.9999f)
        curveTo(10.7586f, 20.9999f, 9.57589f, 20.7485f, 8.5f, 20.2939f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.8292f, 3.82152f)
        curveTo(18.5323f, 2.13939f, 20.7205f, 1.51937f, 21.6005f, 2.39789f)
        curveTo(23.1408f, 3.93544f, 20.0911f, 9.48081f, 14.7889f, 14.7838f)
        curveTo(9.48663f, 20.0868f, 3.93971f, 23.1394f, 2.39946f, 21.6018f)
        curveTo(1.52414f, 20.728f, 2.13121f, 18.5599f, 3.79165f, 15.8774f)
        }
        }.build()

        return _saturn01!!
    }

private var _saturn01: ImageVector? = null
