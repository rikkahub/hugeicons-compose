package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ShutDown: ImageVector
    get() {
        if (_shutDown != null) {
            return _shutDown!!
        }
        _shutDown = ImageVector.Builder(
            name = "ShutDown",
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
        moveTo(7.86907f, 4f)
        curveTo(4.97674f, 5.49689f, 3f, 8.51664f, 3f, 11.9981f)
        curveTo(3f, 16.9686f, 7.02944f, 20.9981f, 12f, 20.9981f)
        curveTo(16.9706f, 20.9981f, 21f, 16.9686f, 21f, 11.9981f)
        curveTo(21f, 8.51664f, 19.0233f, 5.49689f, 16.1309f, 4f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 3f)
        verticalLineTo(10f)
        }
        }.build()

        return _shutDown!!
    }

private var _shutDown: ImageVector? = null
