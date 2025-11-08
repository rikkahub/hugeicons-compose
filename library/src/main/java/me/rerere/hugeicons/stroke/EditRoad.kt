package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.EditRoad: ImageVector
    get() {
        if (_editRoad != null) {
            return _editRoad!!
        }
        _editRoad = ImageVector.Builder(
            name = "EditRoad",
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
        moveTo(3.25195f, 3f)
        verticalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.252f, 3f)
        verticalLineTo(10.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.75195f, 3f)
        verticalLineTo(7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.75195f, 10f)
        verticalLineTo(14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.75195f, 17f)
        verticalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19.6134f, 13.4393f)
        lineTo(20.3077f, 14.1317f)
        curveTo(20.8951f, 14.7175f, 20.8951f, 15.6672f, 20.3077f, 16.253f)
        lineTo(16.6702f, 19.9487f)
        curveTo(16.3841f, 20.234f, 16.0181f, 20.4264f, 15.6203f, 20.5005f)
        lineTo(13.3659f, 20.9885f)
        curveTo(13.01f, 21.0656f, 12.693f, 20.7504f, 12.7692f, 20.3952f)
        lineTo(13.2491f, 18.1599f)
        curveTo(13.3234f, 17.7632f, 13.5163f, 17.3982f, 13.8024f, 17.1129f)
        lineTo(17.4862f, 13.4393f)
        curveTo(18.0736f, 12.8536f, 19.026f, 12.8536f, 19.6134f, 13.4393f)
        }
        }.build()

        return _editRoad!!
    }

private var _editRoad: ImageVector? = null
