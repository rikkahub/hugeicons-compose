package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Pause: ImageVector
    get() {
        if (_pause != null) {
            return _pause!!
        }
        _pause = ImageVector.Builder(
            name = "Pause",
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
        moveTo(4f, 7f)
        curveTo(4f, 5.58579f, 4f, 4.87868f, 4.43934f, 4.43934f)
        curveTo(4.87868f, 4f, 5.58579f, 4f, 7f, 4f)
        curveTo(8.41421f, 4f, 9.12132f, 4f, 9.56066f, 4.43934f)
        curveTo(10f, 4.87868f, 10f, 5.58579f, 10f, 7f)
        verticalLineTo(17f)
        curveTo(10f, 18.4142f, 10f, 19.1213f, 9.56066f, 19.5607f)
        curveTo(9.12132f, 20f, 8.41421f, 20f, 7f, 20f)
        curveTo(5.58579f, 20f, 4.87868f, 20f, 4.43934f, 19.5607f)
        curveTo(4f, 19.1213f, 4f, 18.4142f, 4f, 17f)
        verticalLineTo(7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 7f)
        curveTo(14f, 5.58579f, 14f, 4.87868f, 14.4393f, 4.43934f)
        curveTo(14.8787f, 4f, 15.5858f, 4f, 17f, 4f)
        curveTo(18.4142f, 4f, 19.1213f, 4f, 19.5607f, 4.43934f)
        curveTo(20f, 4.87868f, 20f, 5.58579f, 20f, 7f)
        verticalLineTo(17f)
        curveTo(20f, 18.4142f, 20f, 19.1213f, 19.5607f, 19.5607f)
        curveTo(19.1213f, 20f, 18.4142f, 20f, 17f, 20f)
        curveTo(15.5858f, 20f, 14.8787f, 20f, 14.4393f, 19.5607f)
        curveTo(14f, 19.1213f, 14f, 18.4142f, 14f, 17f)
        verticalLineTo(7f)
        }
        }.build()

        return _pause!!
    }

private var _pause: ImageVector? = null
