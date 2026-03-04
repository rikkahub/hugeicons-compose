package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Refresh04: ImageVector
    get() {
        if (_refresh04 != null) {
            return _refresh04!!
        }
        _refresh04 = ImageVector.Builder(
            name = "Refresh04",
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
        moveTo(3.05493f, 13f)
        curveTo(3.01863f, 12.6717f, 3f, 12.338f, 3f, 12f)
        curveTo(3f, 7.02944f, 7.02944f, 3f, 12f, 3f)
        curveTo(14.8273f, 3f, 17.35f, 4.30367f, 19f, 6.34267f)
        moveTo(20.9451f, 11f)
        curveTo(20.9814f, 11.3283f, 21f, 11.662f, 21f, 12f)
        curveTo(21f, 16.9706f, 16.9706f, 21f, 12f, 21f)
        curveTo(9.17273f, 21f, 6.64996f, 19.6963f, 5f, 17.6573f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 7f)
        horizontalLineTo(17f)
        curveTo(18.4142f, 7f, 19.1213f, 7f, 19.5607f, 6.56066f)
        curveTo(20f, 6.12132f, 20f, 5.41421f, 20f, 4f)
        verticalLineTo(3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 17f)
        horizontalLineTo(7f)
        curveTo(5.58579f, 17f, 4.87868f, 17f, 4.43934f, 17.4393f)
        curveTo(4f, 17.8787f, 4f, 18.5858f, 4f, 20f)
        verticalLineTo(21f)
        }
        }.build()

        return _refresh04!!
    }

private var _refresh04: ImageVector? = null
