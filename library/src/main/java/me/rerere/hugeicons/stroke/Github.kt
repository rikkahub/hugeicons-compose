package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Github: ImageVector
    get() {
        if (_github != null) {
            return _github!!
        }
        _github = ImageVector.Builder(
            name = "Github",
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
        moveTo(10f, 20.5675f)
        curveTo(6.57143f, 21.7248f, 3.71429f, 20.5675f, 2f, 17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 22f)
        verticalLineTo(18.7579f)
        curveTo(10f, 18.1596f, 10.1839f, 17.6396f, 10.4804f, 17.1699f)
        curveTo(10.6838f, 16.8476f, 10.5445f, 16.3904f, 10.1771f, 16.2894f)
        curveTo(7.13394f, 15.4528f, 5f, 14.1077f, 5f, 9.64606f)
        curveTo(5f, 8.48611f, 5.38005f, 7.39556f, 6.04811f, 6.4464f)
        curveTo(6.21437f, 6.21018f, 6.29749f, 6.09208f, 6.31748f, 5.9851f)
        curveTo(6.33746f, 5.87813f, 6.30272f, 5.73852f, 6.23322f, 5.45932f)
        curveTo(5.95038f, 4.32292f, 5.96871f, 3.11619f, 6.39322f, 2.02823f)
        curveTo(6.39322f, 2.02823f, 7.27042f, 1.74242f, 9.26698f, 2.98969f)
        curveTo(9.72282f, 3.27447f, 9.95075f, 3.41686f, 10.1515f, 3.44871f)
        curveTo(10.3522f, 3.48056f, 10.6206f, 3.41384f, 11.1573f, 3.28041f)
        curveTo(11.8913f, 3.09795f, 12.6476f, 3f, 13.5f, 3f)
        curveTo(14.3524f, 3f, 15.1087f, 3.09795f, 15.8427f, 3.28041f)
        curveTo(16.3794f, 3.41384f, 16.6478f, 3.48056f, 16.8485f, 3.44871f)
        curveTo(17.0493f, 3.41686f, 17.2772f, 3.27447f, 17.733f, 2.98969f)
        curveTo(19.7296f, 1.74242f, 20.6068f, 2.02823f, 20.6068f, 2.02823f)
        curveTo(21.0313f, 3.11619f, 21.0496f, 4.32292f, 20.7668f, 5.45932f)
        curveTo(20.6973f, 5.73852f, 20.6625f, 5.87813f, 20.6825f, 5.9851f)
        curveTo(20.7025f, 6.09207f, 20.7856f, 6.21019f, 20.9519f, 6.4464f)
        curveTo(21.6199f, 7.39556f, 22f, 8.48611f, 22f, 9.64606f)
        curveTo(22f, 14.1077f, 19.8661f, 15.4528f, 16.8229f, 16.2894f)
        curveTo(16.4555f, 16.3904f, 16.3162f, 16.8476f, 16.5196f, 17.1699f)
        curveTo(16.8161f, 17.6396f, 17f, 18.1596f, 17f, 18.7579f)
        verticalLineTo(22f)
        }
        }.build()

        return _github!!
    }

private var _github: ImageVector? = null
