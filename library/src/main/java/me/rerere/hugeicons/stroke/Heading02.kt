package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Heading02: ImageVector
    get() {
        if (_heading02 != null) {
            return _heading02!!
        }
        _heading02 = ImageVector.Builder(
            name = "Heading02",
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
        moveTo(3.5f, 5f)
        verticalLineTo(19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.5f, 5f)
        verticalLineTo(19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20.5f, 19f)
        horizontalLineTo(16.5f)
        verticalLineTo(18.6907f)
        curveTo(16.5f, 18.2521f, 16.5f, 18.0327f, 16.5865f, 17.8385f)
        curveTo(16.673f, 17.6443f, 16.836f, 17.4976f, 17.1621f, 17.2041f)
        lineTo(19.7671f, 14.8596f)
        curveTo(20.2336f, 14.4397f, 20.5f, 13.8416f, 20.5f, 13.214f)
        verticalLineTo(13f)
        curveTo(20.5f, 11.8954f, 19.6046f, 11f, 18.5f, 11f)
        curveTo(17.3954f, 11f, 16.5f, 11.8954f, 16.5f, 13f)
        verticalLineTo(13.4f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3.5f, 12f)
        lineTo(13.5f, 12f)
        }
        }.build()

        return _heading02!!
    }

private var _heading02: ImageVector? = null
