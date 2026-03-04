package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Refresh03: ImageVector
    get() {
        if (_refresh03 != null) {
            return _refresh03!!
        }
        _refresh03 = ImageVector.Builder(
            name = "Refresh03",
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
        moveTo(20.9451f, 13f)
        curveTo(20.9814f, 12.6717f, 21f, 12.338f, 21f, 12f)
        curveTo(21f, 7.02944f, 16.9706f, 3f, 12f, 3f)
        curveTo(9.17273f, 3f, 6.64996f, 4.30367f, 5f, 6.34267f)
        moveTo(3.05493f, 11f)
        curveTo(3.01863f, 11.3283f, 3f, 11.662f, 3f, 12f)
        curveTo(3f, 16.9706f, 7.02944f, 21f, 12f, 21f)
        curveTo(14.8273f, 21f, 17.35f, 19.6963f, 19f, 17.6573f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 7f)
        horizontalLineTo(7f)
        curveTo(5.58579f, 7f, 4.87868f, 7f, 4.43934f, 6.56066f)
        curveTo(4f, 6.12132f, 4f, 5.41421f, 4f, 4f)
        verticalLineTo(3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 17f)
        horizontalLineTo(17f)
        curveTo(18.4142f, 17f, 19.1213f, 17f, 19.5607f, 17.4393f)
        curveTo(20f, 17.8787f, 20f, 18.5858f, 20f, 20f)
        verticalLineTo(21f)
        }
        }.build()

        return _refresh03!!
    }

private var _refresh03: ImageVector? = null
