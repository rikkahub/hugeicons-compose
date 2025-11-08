package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.MusicNoteSquare01: ImageVector
    get() {
        if (_musicNoteSquare01 != null) {
            return _musicNoteSquare01!!
        }
        _musicNoteSquare01 = ImageVector.Builder(
            name = "MusicNoteSquare01",
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
        moveTo(13f, 14.5f)
        curveTo(13f, 15.8807f, 11.8807f, 17f, 10.5f, 17f)
        curveTo(9.11929f, 17f, 8f, 15.8807f, 8f, 14.5f)
        curveTo(8f, 13.1193f, 9.11929f, 12f, 10.5f, 12f)
        curveTo(11.8807f, 12f, 13f, 13.1193f, 13f, 14.5f)
        moveTo(13f, 14.5f)
        verticalLineTo(7f)
        curveTo(13.3333f, 7.5f, 13.6f, 9.6f, 16f, 10f)
        }
        }.build()

        return _musicNoteSquare01!!
    }

private var _musicNoteSquare01: ImageVector? = null
