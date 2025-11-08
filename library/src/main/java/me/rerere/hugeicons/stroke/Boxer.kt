package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Boxer: ImageVector
    get() {
        if (_boxer != null) {
            return _boxer!!
        }
        _boxer = ImageVector.Builder(
            name = "Boxer",
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
        moveTo(4.82004f, 3f)
        horizontalLineTo(19.18f)
        curveTo(19.7167f, 3f, 19.9851f, 3f, 20.1838f, 3.0927f)
        curveTo(20.4487f, 3.21631f, 20.6461f, 3.451f, 20.7237f, 3.73439f)
        curveTo(20.7818f, 3.94693f, 20.7377f, 4.21349f, 20.6495f, 4.7466f)
        curveTo(20.584f, 5.14188f, 20.5513f, 5.33952f, 20.4642f, 5.49389f)
        curveTo(20.3481f, 5.69972f, 20.1632f, 5.8574f, 19.9425f, 5.93889f)
        curveTo(19.777f, 6f, 19.578f, 6f, 19.18f, 6f)
        horizontalLineTo(4.82003f)
        curveTo(4.42204f, 6f, 4.22304f, 6f, 4.05749f, 5.93889f)
        curveTo(3.83676f, 5.8574f, 3.65189f, 5.69972f, 3.53577f, 5.49389f)
        curveTo(3.44869f, 5.33952f, 3.41597f, 5.14188f, 3.35054f, 4.7466f)
        curveTo(3.2623f, 4.21349f, 3.21817f, 3.94693f, 3.27633f, 3.73439f)
        curveTo(3.35388f, 3.451f, 3.55133f, 3.21631f, 3.81621f, 3.0927f)
        curveTo(4.01487f, 3f, 4.28326f, 3f, 4.82004f, 3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 6f)
        curveTo(2.80083f, 8.35175f, 2f, 10.0659f, 2f, 12.7001f)
        verticalLineTo(17.7669f)
        curveTo(2f, 19.1536f, 2f, 19.847f, 2.43934f, 20.2778f)
        curveTo(3.35803f, 21.1786f, 8.51722f, 21.3009f, 9.56066f, 20.2778f)
        curveTo(10.6442f, 19.2153f, 9.60514f, 17.1627f, 10.1522f, 15.8675f)
        curveTo(10.488f, 15.0728f, 11.3875f, 14.4452f, 12f, 13.8446f)
        moveTo(12f, 13.8446f)
        lineTo(10.5f, 12.3737f)
        moveTo(12f, 13.8446f)
        curveTo(12.6125f, 14.4452f, 13.512f, 15.0728f, 13.8478f, 15.8675f)
        curveTo(14.3949f, 17.1627f, 13.3558f, 19.2153f, 14.4393f, 20.2778f)
        curveTo(15.358f, 21.1786f, 20.5172f, 21.3009f, 21.5607f, 20.2778f)
        curveTo(22f, 19.847f, 22f, 19.1536f, 22f, 17.7669f)
        verticalLineTo(12.7001f)
        curveTo(22f, 10.0659f, 21.1992f, 8.35174f, 20f, 6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 8.77778f)
        lineTo(12f, 6f)
        lineTo(15f, 11f)
        }
        }.build()

        return _boxer!!
    }

private var _boxer: ImageVector? = null
