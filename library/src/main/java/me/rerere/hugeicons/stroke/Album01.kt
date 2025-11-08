package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Album01: ImageVector
    get() {
        if (_album01 != null) {
            return _album01!!
        }
        _album01 = ImageVector.Builder(
            name = "Album01",
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
        moveTo(6f, 17.9745f)
        curveTo(6.1287f, 19.2829f, 6.41956f, 20.1636f, 7.07691f, 20.8209f)
        curveTo(8.25596f, 22f, 10.1536f, 22f, 13.9489f, 22f)
        curveTo(17.7442f, 22f, 19.6419f, 22f, 20.8209f, 20.8209f)
        curveTo(22f, 19.6419f, 22f, 17.7442f, 22f, 13.9489f)
        curveTo(22f, 10.1536f, 22f, 8.25596f, 20.8209f, 7.07691f)
        curveTo(20.1636f, 6.41956f, 19.2829f, 6.1287f, 17.9745f, 6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 10f)
        curveTo(2f, 6.22876f, 2f, 4.34315f, 3.17157f, 3.17157f)
        curveTo(4.34315f, 2f, 6.22876f, 2f, 10f, 2f)
        curveTo(13.7712f, 2f, 15.6569f, 2f, 16.8284f, 3.17157f)
        curveTo(18f, 4.34315f, 18f, 6.22876f, 18f, 10f)
        curveTo(18f, 13.7712f, 18f, 15.6569f, 16.8284f, 16.8284f)
        curveTo(15.6569f, 18f, 13.7712f, 18f, 10f, 18f)
        curveTo(6.22876f, 18f, 4.34315f, 18f, 3.17157f, 16.8284f)
        curveTo(2f, 15.6569f, 2f, 13.7712f, 2f, 10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 18f)
        curveTo(8.42061f, 13.2487f, 12.2647f, 6.9475f, 18f, 11.6734f)
        }
        }.build()

        return _album01!!
    }

private var _album01: ImageVector? = null
