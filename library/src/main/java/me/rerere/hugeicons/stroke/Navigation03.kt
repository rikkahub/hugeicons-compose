package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Navigation03: ImageVector
    get() {
        if (_navigation03 != null) {
            return _navigation03!!
        }
        _navigation03 = ImageVector.Builder(
            name = "Navigation03",
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
        moveTo(11.922f, 4.79004f)
        curveTo(16.6963f, 3.16245f, 19.0834f, 2.34866f, 20.3674f, 3.63261f)
        curveTo(21.6513f, 4.91656f, 20.8375f, 7.30371f, 19.21f, 12.078f)
        lineTo(18.1016f, 15.3292f)
        curveTo(16.8517f, 18.9958f, 16.2267f, 20.8291f, 15.1964f, 20.9808f)
        curveTo(14.9195f, 21.0216f, 14.6328f, 20.9971f, 14.3587f, 20.9091f)
        curveTo(13.3395f, 20.5819f, 12.8007f, 18.6489f, 11.7231f, 14.783f)
        curveTo(11.4841f, 13.9255f, 11.3646f, 13.4967f, 11.0924f, 13.1692f)
        curveTo(11.0134f, 13.0742f, 10.9258f, 12.9866f, 10.8308f, 12.9076f)
        curveTo(10.5033f, 12.6354f, 10.0745f, 12.5159f, 9.21705f, 12.2769f)
        curveTo(5.35111f, 11.1993f, 3.41814f, 10.6605f, 3.0909f, 9.64127f)
        curveTo(3.00292f, 9.36724f, 2.97837f, 9.08053f, 3.01916f, 8.80355f)
        curveTo(3.17088f, 7.77332f, 5.00419f, 7.14834f, 8.6708f, 5.89838f)
        lineTo(11.922f, 4.79004f)
        }
        }.build()

        return _navigation03!!
    }

private var _navigation03: ImageVector? = null
