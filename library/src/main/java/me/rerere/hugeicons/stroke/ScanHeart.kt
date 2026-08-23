package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ScanHeart: ImageVector
    get() {
        if (_scanHeart != null) {
            return _scanHeart!!
        }
        _scanHeart = ImageVector.Builder(
            name = "ScanHeart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(21.5f, 7.50028f)
            curveTo(21.4085f, 5.65414f, 21.1348f, 4.5031f, 20.316f, 3.68429f)
            curveTo(19.4972f, 2.86548f, 18.3461f, 2.59178f, 16.5f, 2.50028f)
            moveTo(2.5f, 7.49945f)
            curveTo(2.5915f, 5.65331f, 2.8652f, 4.50227f, 3.68401f, 3.68346f)
            curveTo(4.50282f, 2.86465f, 5.65386f, 2.59095f, 7.5f, 2.49945f)
            moveTo(21.5f, 16.4997f)
            curveTo(21.4085f, 18.3459f, 21.1348f, 19.4969f, 20.316f, 20.3157f)
            curveTo(19.4972f, 21.1345f, 18.3461f, 21.4082f, 16.5f, 21.4997f)
            moveTo(2.5f, 16.5006f)
            curveTo(2.5915f, 18.3467f, 2.8652f, 19.4978f, 3.68401f, 20.3166f)
            curveTo(4.50282f, 21.1354f, 5.65386f, 21.4091f, 7.5f, 21.5006f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(11.0464f, 17.1316f)
            curveTo(9.35365f, 15.8906f, 6f, 13.0534f, 6f, 10.5003f)
            curveTo(6f, 8.81277f, 7.26316f, 7.44476f, 9f, 7.44476f)
            curveTo(9.9f, 7.44476f, 10.8f, 7.73888f, 12f, 8.91534f)
            curveTo(13.2f, 7.73888f, 14.1f, 7.44476f, 15f, 7.44476f)
            curveTo(16.7368f, 7.44476f, 18f, 8.81277f, 18f, 10.5003f)
            curveTo(18f, 13.0534f, 14.6463f, 15.8906f, 12.9536f, 17.1316f)
            curveTo(12.384f, 17.5492f, 11.616f, 17.5492f, 11.0464f, 17.1316f)
            close()
        }
        }.build()

        return _scanHeart!!
    }

private var _scanHeart: ImageVector? = null
