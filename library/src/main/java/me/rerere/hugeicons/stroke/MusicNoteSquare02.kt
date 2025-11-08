package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.MusicNoteSquare02: ImageVector
    get() {
        if (_musicNoteSquare02 != null) {
            return _musicNoteSquare02!!
        }
        _musicNoteSquare02 = ImageVector.Builder(
            name = "MusicNoteSquare02",
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
        moveTo(2.5f, 12f)
        curveTo(2.5f, 7.52166f, 2.5f, 5.28249f, 3.89124f, 3.89124f)
        curveTo(5.28249f, 2.5f, 7.52166f, 2.5f, 12f, 2.5f)
        curveTo(16.4783f, 2.5f, 18.7175f, 2.5f, 20.1088f, 3.89124f)
        curveTo(21.5f, 5.28249f, 21.5f, 7.52166f, 21.5f, 12f)
        curveTo(21.5f, 16.4783f, 21.5f, 18.7175f, 20.1088f, 20.1088f)
        curveTo(18.7175f, 21.5f, 16.4783f, 21.5f, 12f, 21.5f)
        curveTo(7.52166f, 21.5f, 5.28249f, 21.5f, 3.89124f, 20.1088f)
        curveTo(2.5f, 18.7175f, 2.5f, 16.4783f, 2.5f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 15.5f)
        curveTo(10f, 16.3284f, 9.32843f, 17f, 8.5f, 17f)
        curveTo(7.67157f, 17f, 7f, 16.3284f, 7f, 15.5f)
        curveTo(7f, 14.6716f, 7.67157f, 14f, 8.5f, 14f)
        curveTo(9.32843f, 14f, 10f, 14.6716f, 10f, 15.5f)
        moveTo(10f, 15.5f)
        verticalLineTo(11f)
        curveTo(10f, 10.1062f, 10f, 9.65932f, 10.2262f, 9.38299f)
        curveTo(10.4524f, 9.10667f, 10.9638f, 9.00361f, 11.9865f, 8.7975f)
        curveTo(13.8531f, 8.42135f, 15.3586f, 7.59867f, 16f, 7f)
        verticalLineTo(13.5f)
        moveTo(16f, 13.75f)
        curveTo(16f, 14.4404f, 15.4404f, 15f, 14.75f, 15f)
        curveTo(14.0596f, 15f, 13.5f, 14.4404f, 13.5f, 13.75f)
        curveTo(13.5f, 13.0596f, 14.0596f, 12.5f, 14.75f, 12.5f)
        curveTo(15.4404f, 12.5f, 16f, 13.0596f, 16f, 13.75f)
        }
        }.build()

        return _musicNoteSquare02!!
    }

private var _musicNoteSquare02: ImageVector? = null
