package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.HotAirBalloon: ImageVector
    get() {
        if (_hotAirBalloon != null) {
            return _hotAirBalloon!!
        }
        _hotAirBalloon = ImageVector.Builder(
            name = "HotAirBalloon",
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
        moveTo(20f, 8.93333f)
        curveTo(20f, 14f, 14.4615f, 18f, 12f, 18f)
        curveTo(9.53846f, 18f, 4f, 14f, 4f, 8.93333f)
        curveTo(4f, 5.10416f, 7.58172f, 2f, 12f, 2f)
        curveTo(16.4183f, 2f, 20f, 5.10416f, 20f, 8.93333f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 8.93333f)
        curveTo(15f, 14f, 12.9231f, 18f, 12f, 18f)
        curveTo(11.0769f, 18f, 9f, 14f, 9f, 8.93333f)
        curveTo(9f, 5.10416f, 10.3431f, 2f, 12f, 2f)
        curveTo(13.6569f, 2f, 15f, 5.10416f, 15f, 8.93333f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 20f)
        curveTo(9f, 19.535f, 9f, 19.3025f, 9.05111f, 19.1118f)
        curveTo(9.18981f, 18.5941f, 9.59413f, 18.1898f, 10.1118f, 18.0511f)
        curveTo(10.3025f, 18f, 10.535f, 18f, 11f, 18f)
        horizontalLineTo(13f)
        curveTo(13.465f, 18f, 13.6975f, 18f, 13.8882f, 18.0511f)
        curveTo(14.4059f, 18.1898f, 14.8102f, 18.5941f, 14.9489f, 19.1118f)
        curveTo(15f, 19.3025f, 15f, 19.535f, 15f, 20f)
        curveTo(15f, 20.465f, 15f, 20.6975f, 14.9489f, 20.8882f)
        curveTo(14.8102f, 21.4059f, 14.4059f, 21.8102f, 13.8882f, 21.9489f)
        curveTo(13.6975f, 22f, 13.465f, 22f, 13f, 22f)
        horizontalLineTo(11f)
        curveTo(10.535f, 22f, 10.3025f, 22f, 10.1118f, 21.9489f)
        curveTo(9.59413f, 21.8102f, 9.18981f, 21.4059f, 9.05111f, 20.8882f)
        curveTo(9f, 20.6975f, 9f, 20.465f, 9f, 20f)
        }
        }.build()

        return _hotAirBalloon!!
    }

private var _hotAirBalloon: ImageVector? = null
