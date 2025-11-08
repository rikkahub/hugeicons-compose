package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Home09: ImageVector
    get() {
        if (_home09 != null) {
            return _home09!!
        }
        _home09 = ImageVector.Builder(
            name = "Home09",
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
        moveTo(22f, 10.5f)
        lineTo(12.8825f, 2.82207f)
        curveTo(12.6355f, 2.61407f, 12.3229f, 2.5f, 12f, 2.5f)
        curveTo(11.6771f, 2.5f, 11.3645f, 2.61407f, 11.1175f, 2.82207f)
        lineTo(2f, 10.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20.5f, 9.5f)
        verticalLineTo(16f)
        curveTo(20.5f, 18.3456f, 20.5f, 19.5184f, 19.8801f, 20.3263f)
        curveTo(19.7205f, 20.5343f, 19.5343f, 20.7205f, 19.3263f, 20.8801f)
        curveTo(18.5184f, 21.5f, 17.3456f, 21.5f, 15f, 21.5f)
        verticalLineTo(17f)
        curveTo(15f, 15.5858f, 15f, 14.8787f, 14.5607f, 14.4393f)
        curveTo(14.1213f, 14f, 13.4142f, 14f, 12f, 14f)
        curveTo(10.5858f, 14f, 9.87868f, 14f, 9.43934f, 14.4393f)
        curveTo(9f, 14.8787f, 9f, 15.5858f, 9f, 17f)
        verticalLineTo(21.5f)
        curveTo(6.65442f, 21.5f, 5.48164f, 21.5f, 4.67372f, 20.8801f)
        curveTo(4.46572f, 20.7205f, 4.27954f, 20.5343f, 4.11994f, 20.3263f)
        curveTo(3.5f, 19.5184f, 3.5f, 18.3456f, 3.5f, 16f)
        verticalLineTo(9.5f)
        }
        }.build()

        return _home09!!
    }

private var _home09: ImageVector? = null
